package amnatariq.org.myquranapplication;

import android.provider.BaseColumns;

public class TableContract {
    private TableContract(){}

    public static class TablesContract implements BaseColumns {
        public static final String TABLE_NAME = "app_table";
        public static final String COLUMN_NAME ="question";
        public static final String COLUMN_INFORMATION = "Information";
        public static final String COLUMN_STATUS = "status";
        public static final String COLUMN_SABAK = "sabak";
        public static final String COLUMN_SABAKI = "sabki";
        public static final String COLUMN_MANZIL = "manzil";
    }
}

//    private boolean sabakStatus;
//    private boolean sabkiStatus;
//    private boolean manzilStatus;
//
//    private String sabakIncorrect;
//    private String sabkiIncorrect;
//    private String manzilIncorrect;