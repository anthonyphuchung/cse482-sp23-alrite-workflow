package org.openmrs.mobile.activities.assessment;

import androidx.fragment.app.Fragment;

//import com.ug.air.alrite.APIs.ApiClient;
//import com.ug.air.alrite.APIs.JsonPlaceHolder;
//import org.openmrs.mobile.activities.alriteadapters.DiagnosisActivity;
//import org.openmrs.mobile.activities.alriteadapters.PatientActivity;
//import org.openmrs.mobile.activities.alriteadapters.PatientAdapter;
//import com.ug.air.alrite.BuildConfig;
//import com.ug.air.alrite.Database.DatabaseHelper;
//import com.openmrs.android_sdk.library.models.History;
//import com.openmrs.android_sdk.library.models.Item;
//import org.openmrs.mobile.R;
//import com.openmrs.android_sdk.utilities.Credentials;


public class PatientRecords extends Fragment {
//
//    View view;
//    RecyclerView recyclerView;
//    EditText etSearch;
//    Button btnSubmit;
//    File[] contents;
//    ProgressBar progressBar;
//    ImageView back;
//    ArrayList<Item> items;
//    PatientAdapter patientAdapter;
//    String cin, pin, gender, age, search, dat, ag, token;
//    ArrayList<String> types, files, file;
//    SharedPreferences sharedPreferences;
//    Intent intent;
////    JsonPlaceHolder jsonPlaceHolder;
////    DatabaseHelper databaseHelper;
//    SwipeRefreshLayout swipeRefreshLayout;
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        view = inflater.inflate(R.layout.fragment_other_patients, container, false);
//
////        databaseHelper = new DatabaseHelper(getActivity());
////        jsonPlaceHolder = ApiClient.getClient().create(JsonPlaceHolder.class);
//
//        recyclerView = view.findViewById(R.id.recyclerView3);
//        etSearch = view.findViewById(R.id.search);
//        back = view.findViewById(R.id.back);
//        btnSubmit = view.findViewById(R.id.submit_btn);
//        progressBar = view.findViewById(R.id.progress_bar);
//        swipeRefreshLayout = view.findViewById(R.id.swipe);
//
//        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
//            @Override
//            public void onRefresh() {
////                accessSharedFile2();
//                swipeRefreshLayout.setRefreshing(false);
//            }
//        });
//
//        back.setVisibility(View.GONE);
//
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
//
//        items = new ArrayList<>();
//        files = new ArrayList<String>();
//
////        accessSharedFile2();
//
//        patientAdapter = new PatientAdapter(getActivity(), items);
//        recyclerView.setAdapter(patientAdapter);
//
//        patientAdapter.setOnItemClickListener(new PatientAdapter.OnItemClickListener() {
//            @Override
//            public void onItemClick(int position) {
//                History history = (History) items.get(position).getObject();
//                String name = history.getFilename();
//                String incomplete = history.getIncomplete();
//                if (incomplete.equals("incomplete")){
//                    intent = new Intent(getActivity(), PatientActivity.class);
//                    intent.putExtra("Fragment", 1);
//                }else {
//                    intent = new Intent(getActivity(), DiagnosisActivity.class);
//                }
//
//                intent.putExtra("filename", name);
//                startActivity(intent);
//                requireActivity().finish();
//            }
//        });
//
//        btnSubmit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                submitData();
//            }
//        });
//
//        return view;
//    }
//
//    private void accessSharedFile2(){
//        files.clear();
//        items.clear();
////        File src = new File("/data/data/" + BuildConfig.APPLICATION_ID + "/shared_prefs");
//        File src = new File("");
//        if (src.exists()) {
//            File[] contents = src.listFiles();
////        Toast.makeText(getActivity(), "" + contents, Toast.LENGTH_SHORT).show();
//            if (contents.length != 0) {
//                for (File f : contents) {
//                    if (f.isFile()) {
//                        String name = f.getName().toString();
//                        files.add(name);
//                    }
//                }
//                Collections.reverse(files);
//                for(String name : files){
//                    if (!name.equals("sharedPrefs.xml") && !name.equals("counter_file.xml")){
//                        String names = name.replace(".xml", "");
//                        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences(names, Context.MODE_PRIVATE);
//                        String bron = sharedPreferences.getString(BRONCHODILATOR, "");
//                        String incomplete = sharedPreferences.getString(INCOMPLETE, "");
//                        String pending = sharedPreferences.getString(PENDING, "");
//                        String fin = sharedPreferences.getString(BRONC, "");
//                        if (bron.isEmpty() || bron.equals("Bronchodialtor Not Given") || !fin.isEmpty()){
//                            cin = sharedPreferences.getString(CIN, "");
//                            pin = sharedPreferences.getString(PIN, "");
//                            age = sharedPreferences.getString(AGE2, "");
//                            gender = sharedPreferences.getString(CHOICE, "");
//                            dat = sharedPreferences.getString(DATE, "");
//                            if (age.isEmpty()){
//                               ag = "0 years 0 months";
//                               gender = "";
//                            }else {
//                                String[] split = age.split("\\.");
//                                ag = split[0] + " years and " + split[1] + " months";
//                            }
//
//                            try {
//                                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
//                                Date date = df.parse(dat);
//                                SimpleDateFormat df1 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm");
//                                String formattedDate = df1.format(date);
//                                History history = new History("Age: " + ag, "Gender: " + gender, cin, "Parent/Guardian: " + pin, formattedDate, names, pending, incomplete);
//                                items.add(new Item(1, history));
//                            } catch (ParseException e) {
//                                e.printStackTrace();
//                            }
//                        }
//                    }
//                }
//            } else {
//                Toast.makeText(getActivity(), "There are no patient records", Toast.LENGTH_SHORT).show();
//            }
//        }
//    }
//
//    private void submitData() {
//        progressBar.setVisibility(View.VISIBLE);
//        btnSubmit.setEnabled(false);
////        Credentials credentials = new Credentials();
////        Cursor res = databaseHelper.getData("1");
////        while (res.moveToNext()){
////            token =  res.getString(2);
////        }
////        File src = new File("/data/data/" + BuildConfig.APPLICATION_ID + "/shared_prefs");
//        File src = new File("");
//        if (src.exists()){
//            contents = src.listFiles();
//            if (contents.length != 0) {
//                for (File f : contents) {
//                    if (f.isFile()) {
//                        String name = f.getName();
//                        if (!name.equals("sharedPrefs.xml") && !name.equals("counter_file.xml")) {
//                            String names = name.replace(".xml", "");
//                            SharedPreferences sharedPreferences = requireActivity().getSharedPreferences(names, MODE_PRIVATE);
//                            SharedPreferences.Editor editor = sharedPreferences.edit();
//                            String bron = sharedPreferences.getString(BRONCHODILATOR, "");
//                            String fin = sharedPreferences.getString(BRONC, "");
//                            String pending = sharedPreferences.getString(PENDING, "");
//                            String incomplete = sharedPreferences.getString(INCOMPLETE, "");
//
//                            if (!pending.equals("pending") && (bron.isEmpty() || bron.equals("Bronchodialtor Not Given") || !fin.isEmpty())){
//                                File patient = new File("/data/data/" + BuildConfig.APPLICATION_ID + "/shared_prefs/" + name);
//                                RequestBody filePart = RequestBody.create(MediaType.parse("*/*"), patient);
//                                MultipartBody.Part fileUpload = MultipartBody.Part.createFormData("patient", patient.getName() ,filePart);
//
//                                Call<String> call = jsonPlaceHolder.sendFile("Token " + token, fileUpload);
//                                call.enqueue(new Callback<String>() {
//                                    @Override
//                                    public void onResponse(Call<String> call, Response<String> response) {
//                                        if (!response.isSuccessful()){
//                                            Log.d("Alrite server issue", "There is an issue with the server" );
//                                            return;
//                                        }
//                                        String message = response.body();
//                                        Log.d("Alrite app: ", "Sever response: " + message);
//                                        patient.delete();
//                                    }
//
//                                    @Override
//                                    public void onFailure(Call<String> call, Throwable t) {
//                                        Log.d("Alrite server issue", "No internet connection" );
////                                    Toast.makeText(getActivity(), "Please turn on your internet connection", Toast.LENGTH_SHORT).show();
//                                    }
//                                });
//                            }
//
//                        }
//                    }
//                }
//                progressBar.setVisibility(View.GONE);
//                btnSubmit.setEnabled(true);
//            }else {
//                progressBar.setVisibility(View.GONE);
//                btnSubmit.setEnabled(true);
//            }
//        }else {
//            progressBar.setVisibility(View.GONE);
//            btnSubmit.setEnabled(true);
//        }
//    }
}