package immutableDemo;

public final class Hospital {


    private final int patientId;
    private final String patientName;
    private final OutPatientDetails outPatientDetails;

    public Hospital(int patientId, String patientName, OutPatientDetails outPatientDetails) {

        this.patientId = patientId;
        this.patientName = patientName;
        this.outPatientDetails = outPatientDetails;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public OutPatientDetails getOutPatientDetails() {
        return outPatientDetails;
    }
}

class Test {
    public static void main(String[] args) {
        Hospital h = new Hospital(101, "Jayesh", new OutPatientDetails("dd18", 650, "Dr.Bhagwan"));
        Hospital h1 = new Hospital(h.getPatientId(), h.getPatientName(), new OutPatientDetails(h.getOutPatientDetails().getFileNO(), h.getOutPatientDetails().getConsultFee(), h.getOutPatientDetails().getDocName()));

//        h.getOutPatientDetails();
//        System.out.println(h.getPatientId(),h.getPatientName(),h.getOutPatientDetails());
//        OutPatientDetails opd=h.getOutPatientDetails();
        OutPatientDetails opd1 = h1.getOutPatientDetails();
        System.out.println(h.getOutPatientDetails().getFileNO());
        System.out.println(h1.getOutPatientDetails().getFileNO());


    }
}
