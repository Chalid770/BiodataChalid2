public class biochalid extends AppCompatActivity {
    TextView tampilData;
    public static String EXTRA_DATA = "extra_data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biochalid);
        tampilData = (TextView) findViewById(R.id.tampil);
        Biodata tampung = getIntent().getParcelableExtra(EXTRA_DATA);
        String text = "NIM : " + tampung.getNim() + " Nama : " + tampung.getNama() + " Kelas : " + tampung.getKelas() +
                " Tanggal Lahir : " + tampung.getTanggal();
        tampilData.setText(text);
    }
}
