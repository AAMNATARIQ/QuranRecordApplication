package amnatariq.org.myquranapplication;

public class ModalClass {
//    private int imageview1;
//    private String textview1;
//    private String textview2;
//    private String textview3;
//    private String divider;
//
//    ModalClass(int imageview1,String textview1,String textview2,String textview3,String divider)
//    {
//        this.imageview1=imageview1;
//        this.textview1=textview1;
//        this.textview2=textview2;
//        this.textview3=textview3;
//        this.divider = divider;
//    }
//
//    public int getImageview1() {
//        return imageview1;
//    }
//
//    public void setImageview1(int imageview1) {
//        this.imageview1 = imageview1;
//    }
//
//    public String getTextview1() {
//        return textview1;
//    }
//
//    public void setTextview1(String textview1) {
//        this.textview1 = textview1;
//    }
//
//    public String getTextview2() {
//        return textview2;
//    }
//
//    public void setTextview2(String textview2) {
//        this.textview2 = textview2;
//    }
//
//    public String getTextview3() {
//        return textview3;
//    }
//
//    public void setTextview3(String textview3) {
//        this.textview3 = textview3;
//    }
//
//    public String getDivider() {
//        return divider;
//    }
//
//    public void setDivider(String divider) {
//        this.divider = divider;
//    }


    private String studentName;

    private int pic;

    private String studentDept;

    private int sabak;
    private boolean sabakStatus;

    private int sabki;
    private boolean sabkiStatus;

    private int manzil;
    private boolean manzilStatus;

    private String incorrectSabak;
    private String incorrectSabki;
    private String incorrectMazil;

    private String divider;

    public ModalClass(String studentName,int pic,String studentDept, int sabak, boolean sabakStatus, int sabki, boolean sabkiStatus, int manzil, boolean manzilStatus, String incorrectSabak, String incorrectSabki, String incorrectMazil,String divider ) {
        this.studentName = studentName;
        this.pic = pic;
        this.studentDept=studentDept;
        this.sabak = sabak;
        this.sabakStatus = sabakStatus;
        this.sabki = sabki;
        this.sabkiStatus = sabkiStatus;
        this.manzil = manzil;
        this.manzilStatus = manzilStatus;
        this.incorrectSabak = incorrectSabak;
        this.incorrectSabki = incorrectSabki;
        this.incorrectMazil = incorrectMazil;
        this.divider=divider;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentDept() {
        return studentDept;
    }

    public void setStudentDept(String studentDept) {
        this.studentDept = studentDept;
    }

    public String getDivider() {
        return divider;
    }

    public void setDivider(String divider) {
        this.divider = divider;
    }

    public int getSabak() {
        return sabak;
    }

    public void setSabak(int sabak) {
        this.sabak = sabak;
    }

    public boolean isSabakStatus() {
        return sabakStatus;
    }

    public void setSabakStatus(boolean sabakStatus) {
        this.sabakStatus = sabakStatus;
    }

    public int getSabki() {
        return sabki;
    }

    public void setSabki(int sabki) {
        this.sabki = sabki;
    }

    public boolean isSabkiStatus() {
        return sabkiStatus;
    }

    public void setSabkiStatus(boolean sabkiStatus) {
        this.sabkiStatus = sabkiStatus;
    }

    public int getManzil() {
        return manzil;
    }

    public void setManzil(int manzil) {
        this.manzil = manzil;
    }

    public boolean isManzilStatus() {
        return manzilStatus;
    }

    public void setManzilStatus(boolean manzilStatus) {
        this.manzilStatus = manzilStatus;
    }

    public String getIncorrectSabak() {
        return incorrectSabak;
    }

    public void setIncorrectSabak(String incorrectSabak) {
        this.incorrectSabak = incorrectSabak;
    }

    public String getIncorrectSabki() {
        return incorrectSabki;
    }

    public void setIncorrectSabki(String incorrectSabki) {
        this.incorrectSabki = incorrectSabki;
    }

    public String getIncorrectMazil() {
        return incorrectMazil;
    }

    public void setIncorrectMazil(String incorrectMazil) {
        this.incorrectMazil = incorrectMazil;
    }


    @Override
    //string pic +divider
    public String toString() {
        return "LearningModel{" +
                "studentName='" + studentName + '\'' +
                ", studentDept='" + studentDept + '\'' +
                ", sabak=" + sabak +
                ", sabakStatus=" + sabakStatus +
                ", sabki=" + sabki +
                ", sabkiStatus=" + sabkiStatus +
                ", manzil=" + manzil +
                ", manzilStatus=" + manzilStatus +
                ", incorrectSabak='" + incorrectSabak + '\'' +
                ", incorrectSabki='" + incorrectSabki + '\'' +
                ", incorrectMazil='" + incorrectMazil + '\'' +
                '}';
    }

}
