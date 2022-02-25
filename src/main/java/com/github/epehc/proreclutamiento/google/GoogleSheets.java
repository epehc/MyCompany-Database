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
     * ID of the Spreadsheet to be worked with
     */
    private static final String SPREADSHEET_ID = "1ptUdJ-99TFzq_bGvxB9H3Iz5T5y4-A4y64PXj6tYEkI";

    /**
     * Global instance of the scopes required by this quickstart.
     * If modifying these scopes, delete your previously saved tokens/ folder.
     */
    private static final List<String> SCOPES = Collections.singletonList(SheetsScopes.SPREADSHEETS_READONLY);
    /**
     * Path to the stored credentials to use oauth from Google
     */
    private static final String CREDENTIALS_FILE_PATH = "/com/github/epehc/proreclutamiento/credentials/credentials.json";

    /**
     * List of List to store the information from the database
     */
    private static List<List<Object>> values;

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
        final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
        final String range = "Main!A4:DU";
        Sheets service = new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT))
                .setApplicationName(APPLICATION_NAME)
                .build();
        ValueRange response = service.spreadsheets().values()
                .get(SPREADSHEET_ID, range)
                .execute();
        values = response.getValues();
        if (values == null || values.isEmpty()) {
            System.out.println("No data found.");
        }
    }

    /**
     * Method to get the Information from the first few Columns to later add in a TableView in MainController class
     * @return an ObservableList
     * @throws GeneralSecurityException
     * @throws IOException
     */
    public ObservableList<InformacionInicio> getTableViewContentForInicio() throws GeneralSecurityException, IOException {
        ObservableList<InformacionInicio> list = FXCollections.observableArrayList();
        final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
        final String range = "Invertido!A4:E";
        Sheets service = new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT))
                .setApplicationName(APPLICATION_NAME)
                .build();
        ValueRange response = service.spreadsheets().values()
                .get(SPREADSHEET_ID, range)
                .execute();
        List<List<Object>> values = response.getValues();
        
        for(List row : values){
            list.add(new InformacionInicio((String) row.get(0), (String) row.get(2), (String) row.get(3), (String) row.get(4)));
        }
        return list;
    }

    public InformacionEstudios getInformacionEstudios(String dpi){
        for(List row: values){
            if(row.get(0).equals(dpi)){
                return new InformacionEstudios((String) row.get(46),(String) row.get(47), (String) row.get(48),(String) row.get(49),
                        (String) row.get(50), (String) row.get(51),(String) row.get(52),(String) row.get(53),(String) row.get(54),
                        (String) row.get(55), (String) row.get(56),(String) row.get(57),(String) row.get(58),
                        (String) row.get(59),(String) row.get(60),(String) row.get(61));
            }
        }
        return new InformacionEstudios();
    }

    public InformacionReferencias getInfoReferencias(String dpi) throws GeneralSecurityException, IOException {
        List<List<Object>> list = FXCollections.observableArrayList();
        final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
        final String range = "Referencias!A4:I";
        Sheets service = new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT))
                .setApplicationName(APPLICATION_NAME)
                .build();
        ValueRange response = service.spreadsheets().values()
                .get(SPREADSHEET_ID, range)
                .execute();
        List<List<Object>> values = response.getValues();

        for(List row : values){
            if(row.get(0).equals(dpi))
            return new InformacionReferencias((String)row.get(0), (String)row.get(5), (String)row.get(6), (String)row.get(7), (String)row.get(8));
        }
        return new InformacionReferencias();
    }

    public InformacionLaboral getInformacionLaboral(String dpi){
        for(List row: values){
            if(row.get(0).equals(dpi)){
                return new InformacionLaboral((String) row.get(62),(String) row.get(63),(String) row.get(64),(String) row.get(65),
                        (String) row.get(66),(String) row.get(67),(String) row.get(68),(String) row.get(69),(String) row.get(70),
                        (String) row.get(71),(String) row.get(72),(String) row.get(73),(String) row.get(74),
                        (String) row.get(75),(String) row.get(76),(String) row.get(77),(String) row.get(78),(String) row.get(79),
                        (String) row.get(80),(String) row.get(81),(String) row.get(82),(String) row.get(83),
                        (String) row.get(84),(String) row.get(85),(String) row.get(86),(String) row.get(87),(String) row.get(88),
                        (String) row.get(89),(String) row.get(90),(String) row.get(91),(String) row.get(92),(String) row.get(93),
                        (String) row.get(94),(String) row.get(95),(String) row.get(96),(String) row.get(97),
                        (String) row.get(98),(String) row.get(99),(String) row.get(100),(String) row.get(101),(String) row.get(102),
                        (String) row.get(103), (String) row.get(104), (String) row.get(105));
            }
        }
        return new InformacionLaboral();
    }

    /**
     * Getter for the List of List of items in the spreadsheet
     * @return
     */
    public List<List<Object>> getValues() {
        return values;
    }

}