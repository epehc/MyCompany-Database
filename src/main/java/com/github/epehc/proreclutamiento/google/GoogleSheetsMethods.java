package com.github.epehc.proreclutamiento.google;

import com.github.epehc.proreclutamiento.informaciones.InformacionEstudios;
import com.github.epehc.proreclutamiento.informaciones.InformacionInicio;
import com.github.epehc.proreclutamiento.informaciones.InformacionLaboral;
import com.google.api.services.sheets.v4.model.ValueRange;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

public class GoogleSheetsMethods {

    private GoogleSheets sheets;

    public GoogleSheetsMethods() {
        try {
            this.sheets = new GoogleSheets();
        } catch (GeneralSecurityException | IOException e) {
            e.printStackTrace();
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

        //Different value range since another range in another spreadsheet is being used
        ValueRange response = GoogleSheets.service.spreadsheets().values()
                .get(GoogleSheets.SPREADSHEET_ID, GoogleSheets.RANGE_INVERSE_FOR_START)
                .execute();
        List<List<Object>> values = response.getValues();

        for(List row : values){
            list.add(new InformacionInicio((String) row.get(0), (String) row.get(2), (String) row.get(3), (String) row.get(4)));
        }
        return list;
    }

    public InformacionEstudios getInformacionEstudios(String dpi){
        for(List row: GoogleSheets.values){
            if(row.get(0).equals(dpi)){
                return new InformacionEstudios((String) row.get(46),(String) row.get(47), (String) row.get(48),(String) row.get(49),
                        (String) row.get(50), (String) row.get(51),(String) row.get(52),(String) row.get(53),(String) row.get(54),
                        (String) row.get(55), (String) row.get(56),(String) row.get(57),(String) row.get(58),
                        (String) row.get(59),(String) row.get(60),(String) row.get(61));
            }
        }
        return new InformacionEstudios();
    }

    public InformacionLaboral getInformacionLaboral(String dpi){
        for(List row: GoogleSheets.values){
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
}
