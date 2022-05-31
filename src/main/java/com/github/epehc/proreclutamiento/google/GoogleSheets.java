package com.github.epehc.proreclutamiento.google;

import com.github.epehc.proreclutamiento.informaciones.InformacionEstudios;
import com.github.epehc.proreclutamiento.informaciones.InformacionInicio;
import com.github.epehc.proreclutamiento.informaciones.InformacionLaboral;
import com.github.epehc.proreclutamiento.informaciones.InformacionReferencias;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.SheetsScopes;
import com.google.api.services.sheets.v4.model.ValueRange;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.List;

/**
 * Sample for Google Sheets API implementation
 * adapted from example on https://developers.google.com/sheets/api/quickstart/java
 * to fit to the actual required spreadsheet
 */
public class GoogleSheets {
    /**
     * Name of the Application
     */
    private static final String APPLICATION_NAME = "PROreclutamiento";
    /**
     * .json Factory to read the credentials.json file
     */
    private static final JsonFactory JSON_FACTORY = GsonFactory.getDefaultInstance();
    /**
     * Directory to be created to store the tokens
     */
    private static final String TOKENS_DIRECTORY_PATH = "tokens";

    /**
     * Entire range of the Spreadsheet to work on
     */
    static final String RANGE_ENTIRE = "Main!A4:FF";

    /**
     * ID of the Spreadsheet to be worked with
     */
    static final String SPREADSHEET_ID = "1LD7eeSJvMXhRbChjjx1QSxqjWmb5UIjuaUup24D9BFo";

    /**
     * Global instance of the scopes required by this quickstart.
     * If modifying these scopes, delete your previously saved tokens/ folder.
     */
    private static final List<String> SCOPES = Collections.singletonList(SheetsScopes.SPREADSHEETS);
    /**
     * Path to the stored credentials to use oauth from Google
     */
    private static final String CREDENTIALS_FILE_PATH = "/com/github/epehc/proreclutamiento/credentials/credentials.json";

    static Sheets service;

    /**
     * List of List to store the information from the database
     */
    static List<List<Object>> values;

    /**
     * Creates an authorized Credential object.
     * @param HTTP_TRANSPORT The network HTTP Transport.
     * @return An authorized Credential object.
     * @throws IOException If the credentials.json file cannot be found.
     */
    private static Credential getCredentials(final NetHttpTransport HTTP_TRANSPORT) throws IOException {
        // Load client secrets.
        InputStream in = GoogleSheets.class.getResourceAsStream(CREDENTIALS_FILE_PATH);
        if (in == null) {
            throw new FileNotFoundException("Resource not found: " + CREDENTIALS_FILE_PATH);
        }
        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));

        // Build flow and trigger user authorization request.
        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
                HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
                .setDataStoreFactory(new FileDataStoreFactory(new java.io.File(TOKENS_DIRECTORY_PATH)))
                .setAccessType("offline")
                .build();
        LocalServerReceiver receiver = new LocalServerReceiver.Builder().setPort(8888).build();
        return new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");
    }

    /**
     * Constructor with the required information to use in other java classes.
     * @throws GeneralSecurityException
     * @throws IOException
     */
    public GoogleSheets() throws GeneralSecurityException, IOException {
        // Build a new authorized API client service.
        NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
        service = new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT))
                .setApplicationName(APPLICATION_NAME)
                .build();
        ValueRange response = service.spreadsheets().values()
                .get(SPREADSHEET_ID, RANGE_ENTIRE)
                .execute();
        values = response.getValues();
        if (values == null || values.isEmpty()) {
            System.out.println("No data found.");
        }
    }



}