package immutableDemo;

public final class OutPatientDetails {
    private final String fileNO;
    private final int consultFee;
    private final String docName;

    public OutPatientDetails(String fileNo, int consultFee, String docName) {
        this.fileNO = fileNo;
        this.consultFee = consultFee;
        this.docName = docName;
    }

    public String getFileNO() {
        return fileNO;
    }

    public int getConsultFee() {
        return consultFee;
    }

    public String getDocName() {
        return docName;
    }
}
