package com.github.epehc.proreclutamiento.google;

import com.github.epehc.proreclutamiento.controllers.MainController;
import com.github.epehc.proreclutamiento.informaciones.*;
import com.google.api.services.sheets.v4.model.AppendValuesResponse;
import com.google.api.services.sheets.v4.model.UpdateValuesResponse;
import com.google.api.services.sheets.v4.model.ValueRange;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.List;

import static com.github.epehc.proreclutamiento.google.GoogleSheets.SPREADSHEET_ID;

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
                .get(SPREADSHEET_ID, "Main!A4:E")
                .execute();
        List<List<Object>> values = response.getValues();

        for(List row : values){
            list.add(new InformacionInicio((String) row.get(0),(String) row.get(1), (String) row.get(2), (String) row.get(3), (String) row.get(4)));

        }
        return list;
    }

    /**
     * Method to get all the studies-related Information of a candidate from the Database
     * @param dpi the ID of the candidate to for
     * @return the studies information as an InformacionEstudios object
     */
    public InformacionEstudios getInformacionEstudios(String dpi){
        for(List row: GoogleSheets.values){
            if(row.get(0).equals(dpi)){
                return new InformacionEstudios((String) row.get(45), (String) row.get(46),(String) row.get(47), (String) row.get(48),(String) row.get(49),
                        (String) row.get(50), (String) row.get(51),(String) row.get(52),(String) row.get(53),(String) row.get(54),
                        (String) row.get(55), (String) row.get(56),(String) row.get(57),(String) row.get(58),
                        (String) row.get(59),(String) row.get(60),(String) row.get(61));
            }
        }
        return new InformacionEstudios();
    }

    /**
     * Method to get all the working-related information of a candidate from the Database
     * @param dpi the ID of the candidate to look for
     * @return the working information as an InformacionLaboral object
     */
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

    /**
     * Method to get all the working references-related information of a candidate from the Database
     * @param dpi the ID of the candidate to look for
     * @return the working information as an InformacionReferencias object
     */
    public InformacionReferencias getInformacionReferencias(String dpi) {
        for(List row: GoogleSheets.values){
            if(row.get(0).equals(dpi)){
                return new InformacionReferencias((String) row.get(121), (String) row.get(122),(String) row.get(123), (String) row.get(124),
                                                (String) row.get(125), (String) row.get(126),
                                                (String) row.get(127), (String) row.get(128),(String) row.get(129), (String) row.get(130),
                                                (String) row.get(131), (String) row.get(132),
                                                (String) row.get(133), (String) row.get(134),(String) row.get(135), (String) row.get(136),
                                                (String) row.get(137), (String) row.get(138),
                                                (String) row.get(139), (String) row.get(140),(String) row.get(141), (String) row.get(142),
                                                (String) row.get(143), (String) row.get(144));
            }
        }
        return new InformacionReferencias();
    }

    /**
     * Method to get all the personal information of a candidate from the Database
     * @param dpi the ID of the candidate to look for
     * @return the working information as an InformacionPersonal object
     */
    public InformacionPersonal getInformacionPersonal(String dpi){
        for(List row: GoogleSheets.values){
            if(row.get(0).equals(dpi)){
                return new InformacionPersonal((String) row.get(0), (String) row.get(1), (String) row.get(2), (String) row.get(3), (String) row.get(4),
                        (String) row.get(5), (String) row.get(6), (String) row.get(7), (String) row.get(8),
                        (String) row.get(9), (String) row.get(10), (String) row.get(11), (String) row.get(12),
                        (String) row.get(13), (String) row.get(14), (String) row.get(15), (String) row.get(16),
                        (String) row.get(17), (String) row.get(18), (String) row.get(19), (String) row.get(20),
                        (String) row.get(21), (String) row.get(22), (String) row.get(23), (String) row.get(24),
                        (String) row.get(25), (String) row.get(26), (String) row.get(27), (String) row.get(28),
                        (String) row.get(29), (String) row.get(30), (String) row.get(31), (String) row.get(32),
                        (String) row.get(33), (String) row.get(34), (String) row.get(35), (String) row.get(36),
                        (String) row.get(37), (String) row.get(38), (String) row.get(39), (String) row.get(40),
                        (String) row.get(41), (String) row.get(42), (String) row.get(43), (String) row.get(44),

                        (String) row.get(106), (String) row.get(107), (String) row.get(108), (String) row.get(109),
                        (String) row.get(110), (String) row.get(111), (String) row.get(112), (String) row.get(113),
                        (String) row.get(114), (String) row.get(118), (String) row.get(119), (String) row.get(120),
                        (String) row.get(115), (String) row.get(116), (String) row.get(117));
            }
        }
        return new InformacionPersonal();
    }

    /**
     * Method to get all the paperwork information of a candidate from the Database
     * @param dpi the ID of the candidate to look for
     * @return the working information as an InformacionPapeleria object
     */
    public InformacionPapeleria getInformacionPapeleria(String dpi){
        for(List row: GoogleSheets.values){
            if(row.get(0).equals(dpi)){
                return new InformacionPapeleria((String) row.get(145), (String) row.get(146), (String) row.get(147), (String) row.get(148), (String) row.get(149),
                        (String) row.get(150), (String) row.get(151), (String) row.get(152), (String) row.get(153), (String) row.get(154), (String) row.get(155),
                        (String) row.get(156), (String) row.get(157), (String) row.get(158), (String) row.get(159), (String) row.get(160), (String) row.get(161));
            }
        }
        return new InformacionPapeleria();
    }

    //Add data
    private void addData() throws IOException {

        ValueRange appendBody = new ValueRange()
                .setValues(Arrays.asList(
                        Arrays.asList("", "", "", "")
                ));

        AppendValuesResponse appendResult = GoogleSheets.service.spreadsheets().values()
                .append(SPREADSHEET_ID, "spreadsheetName", appendBody)
                .setValueInputOption("USER_ENTERED")
                .setInsertDataOption("INSERT_ROWS")
                .setIncludeValuesInResponse(true)
                .execute();

    }

    /**
     * Method to update the work references comments
     * @param info InformacionReferencias Object containing the job references information
     * @throws IOException
     */
    public void updateReferenciasLaborales(InformacionReferencias info) throws IOException {
        ValueRange body = new ValueRange()
                .setValues(Arrays.asList(
                        Arrays.asList(info.getNombreReferencia1(), info.getPuestoReferencia1(), info.getFechasReferencia1(),
                                info.getPuestoEjercidoReferencia1(), info.getMotivoSalidaReferencia1(), info.getDescripcionReferencia1(),
                                info.getNombreReferencia2(), info.getPuestoReferencia2(), info.getFechasReferencia2(),
                                info.getPuestoEjercidoReferencia2(), info.getMotivoSalidaReferencia2(), info.getDescripcionReferencia2(),
                                info.getNombreReferencia3(), info.getPuestoReferencia3(), info.getFechasReferencia3(),
                                info.getPuestoEjercidoReferencia3(), info.getMotivoSalidaReferencia3(), info.getDescripcionReferencia3(),
                                info.getNombreReferencia4(), info.getPuestoReferencia4(), info.getFechasReferencia4(),
                                info.getPuestoEjercidoReferencia4(), info.getMotivoSalidaReferencia4(), info.getDescripcionReferencia4())
                ));

        int rowToUpdate = findRowToUpdate(MainController.noDeDpiActual.get(), GoogleSheets.RANGE_ENTIRE) + 4;
        if(rowToUpdate <0){
            return;
        }
        UpdateValuesResponse result = GoogleSheets.service.spreadsheets().values()
                .update(SPREADSHEET_ID, "Main!DR"+rowToUpdate+":EO"+rowToUpdate, body)
                .setValueInputOption("RAW")
                .execute();
    }

    /**
     * Method to update the work information
     * @param info InformacionLaboral Object containing the work related information
     * @throws IOException
     */
    public void updateInformacionLaboral(InformacionLaboral info) throws IOException{
        ValueRange body = new ValueRange()
                .setValues(Arrays.asList(
                        Arrays.asList(info.getEmpresa1(), info.getFechaInicio1(), info.getFechaFin1(), info.getTelefonoEmpresa1(), info.getDireccionEmpresa1(),
                                info.getPuesto1(), info.getPuesto1(), info.getJefe1(), info.getTelefonoJefe1(), info.getSalario1(), info.getResponsabilidades1(),
                                info.getEmpresa2(), info.getFechaInicio2(), info.getFechaFin2(), info.getTelefonoEmpresa2(), info.getDireccionEmpresa2(),
                                info.getPuesto2(), info.getPuesto2(), info.getJefe2(), info.getTelefonoJefe2(), info.getSalario2(), info.getResponsabilidades2(),
                                info.getEmpresa3(), info.getFechaInicio3(), info.getFechaFin3(), info.getTelefonoEmpresa3(), info.getDireccionEmpresa3(),
                                info.getPuesto3(), info.getPuesto3(), info.getJefe3(), info.getTelefonoJefe3(), info.getSalario3(), info.getResponsabilidades3(),
                                info.getEmpresa4(), info.getFechaInicio4(), info.getFechaFin4(), info.getTelefonoEmpresa4(), info.getDireccionEmpresa4(),
                                info.getPuesto4(), info.getPuesto4(), info.getJefe4(), info.getTelefonoJefe4(), info.getSalario4(), info.getResponsabilidades4())
                ));

        int rowToUpdate = findRowToUpdate(MainController.noDeDpiActual.get(), GoogleSheets.RANGE_ENTIRE) + 4;
        if(rowToUpdate <0){
            return;
        }
        UpdateValuesResponse result = GoogleSheets.service.spreadsheets().values()
                .update(SPREADSHEET_ID, "Main!BK"+rowToUpdate+":DB"+rowToUpdate, body)
                .setValueInputOption("RAW")
                .execute();
    }

    /**
     * Method to update the paperwork information in the database
     * @param info the InformacionPapeleria object containing the paperwork information to be updated
     * @throws IOException
     */
    public void updateInformacionPapeleria(InformacionPapeleria info) throws IOException{
        ValueRange body = new ValueRange()
                .setValues(Arrays.asList(
                        Arrays.asList(info.getPapeleriaCompleta(), info.getDpi(), info.getRtu(), info.getAntecedentesPenales(), info.getAntecedentesPoliciales(),
                                info.getReciboServicios(), info.getConstanciasEstudios(), info.getConstanciasLaborales(), info.getCv(),
                                info.getReferenciasLaborales(), info.getCartasRecomendacion(), info.getPasaporte(), info.getConstanciaResidencia(),
                                info.getCarneVacunacion(), info.getTarjetaSalud(), info.getTarjetaPulmones(), info.getTarjetaManipulacionAlimentos())
                ));

        int rowToUpdate = findRowToUpdate(MainController.noDeDpiActual.get(), GoogleSheets.RANGE_ENTIRE) + 4;
        if(rowToUpdate <0){
            return;
        }
        UpdateValuesResponse result = GoogleSheets.service.spreadsheets().values()
                .update(SPREADSHEET_ID, "Main!EP"+rowToUpdate+":FF"+rowToUpdate, body)
                .setValueInputOption("RAW")
                .execute();
    }

    /**
     * Method to update the personal information of the candidate.
     *
     * Since the personal information is split into two in the database, the process will be repeated twice, as opposed to previous update methods
     * @param info InformacionPersonal Object containing the personal information from the candidate
     * @throws IOException
     */
    public void updateInformacionPersonal(InformacionPersonal info) throws IOException{
        ValueRange body = new ValueRange()
                .setValues(Arrays.asList(
                        Arrays.asList(info.getNombre(),
                                info.getPuesto(), info.getComoEntero(), info.getGenero(), info.getNoTelefono(),
                                info.getNoCelular(), info.getCorreo(), info.getFechaNacimiento(), info.getEdad(),
                                info.getViveCon(), info.getNacionalidad(), info.getEstadoCivil(), info.getPersonasDependientes(),
                                info.getLicencia(), info.getTipoLicencia(), info.getFechaExpiracionLicencia(), info.getCantidadTiempoManejando(),
                                info.getPoseeVehiculo(), info.getVehiculo(), info.getAspiracionSalarial(), info.getReligion(),
                                info.getViajarInterior(), info.getViajarExtranjero(), info.getIdiomasManejados(), info.getSoftwareManejado(),
                                info.getPartidoPolitico(), info.getSindicato(), info.getAdjetivos(), info.getFuma(),
                                info.getFumaFrecuencia(), info.getAlcohol(), info.getAlcoholFrecuencia(), info.getDrogas(),
                                info.getTatuajes(), info.getPaisResidencia(), info.getCalle(), info.getZona(),
                                info.getMunicipio(), info.getDepartamento(), info.getNombreConyuge(), info.getTrabajoConyuge(),
                                info.getTelefonoConyuge())
                ));

        int rowToUpdate = findRowToUpdate(MainController.noDeDpiActual.get(), GoogleSheets.RANGE_ENTIRE) + 4;
        if(rowToUpdate <0){
            return;
        }
        UpdateValuesResponse result = GoogleSheets.service.spreadsheets().values()
                .update(SPREADSHEET_ID, "Main!D"+rowToUpdate+":AS"+rowToUpdate, body)
                .setValueInputOption("RAW")
                .execute();

        body = new ValueRange()
                .setValues(Arrays.asList(
                        Arrays.asList(info.getNombrePapa(), info.getTrabajoPapa(), info.getTelefonoPapa(),
                                info.getNombreMama(), info.getTrabajoMama(), info.getTelefonoMama(),
                                info.getNombreHermano1(), info.getTrabajoHermano1(), info.getTelefonoHermano1(),
                                info.getNombreHermano2(), info.getTrabajoHermano2(), info.getTelefonoHermano2(),
                                info.getNombreConocido(), info.getTrabajoConocido(), info.getTelefonoConocido())
                ));

        result = GoogleSheets.service.spreadsheets().values()
                .update(SPREADSHEET_ID, "Main!DC"+rowToUpdate+":DQ"+rowToUpdate, body)
                .setValueInputOption("RAW")
                .execute();

    }


    /**
     * Method to update the educational information
     * @param info InformacionEstudios Object containing the educational information
     * @throws IOException
     */
    public void updateInformacionEstudios(InformacionEstudios info) throws IOException{
        ValueRange body = new ValueRange()
                .setValues(Arrays.asList(
                        Arrays.asList(info.getEstudiosMasAltos(), info.getDoctoradoInstitucion(), info.getDoctoradoEstudio(), info.getDoctoradoGrado(),
                                info.getMaestriaInstitucion(), info.getMaestriaEstudio(), info.getMaestriaGrado(),
                                info.getLicenciaturaInstitucion(), info.getLicenciaturaEstudio(), info.getLicenciaturaGrado(),
                                info.getTecnicoInstitucion(), info.getTecnicoEstudio(), info.getTecnicoGrado(),
                                info.getColegioInstitucion(), info.getColegioEstudio(), info.getColegioGrado(), info.getOtrosEstudios())
                ));

        int rowToUpdate = findRowToUpdate(MainController.noDeDpiActual.get(), GoogleSheets.RANGE_ENTIRE) + 4;
        if(rowToUpdate <0){
            return;
        }
        UpdateValuesResponse result = GoogleSheets.service.spreadsheets().values()
                .update(SPREADSHEET_ID, "Main!AT"+rowToUpdate+":BJ"+rowToUpdate, body)
                .setValueInputOption("RAW")
                .execute();
    }

    /**
     * Method to find the row in which the information needs to be updated
     * @param dpi The ID number to find
     * @param range in what range (in what tab it should search)
     * @return the row where the updated information is expected to go to
     * @throws IOException
     */
    private int findRowToUpdate(String dpi, String range) throws IOException {
        ValueRange response = GoogleSheets.service.spreadsheets().values()
                .get(SPREADSHEET_ID, range)
                .execute();
        List<List<Object>> values = response.getValues();
        int count = 0;
        for(List row : values){
            if(row.get(0).equals(dpi)){
                return count;
            }
            else{
                count++;
            }
        }
        return -1;
    }
}
