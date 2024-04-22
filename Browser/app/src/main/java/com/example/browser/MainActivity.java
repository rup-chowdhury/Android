package com.example.browser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    WebView viewBrowser;

    EditText edtURL;

    Button btnGo;

    LinearLayout layout;

    Button yes, no;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.layout_main);



        edtURL = findViewById(R.id.edt_url);

        btnGo = findViewById(R.id.btn_go);



        viewBrowser = findViewById(R.id.web_browser);
//        viewBrowser.loadUrl("https://www.youtube.com/");
        viewBrowser.getSettings().setJavaScriptEnabled(true);
        viewBrowser.setWebViewClient(new WebViewClient());

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = edtURL.getText().toString();

                if(url.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please write on the URL bar", Toast.LENGTH_SHORT).show();
                }else {
                    String regularExpression = "^((http?|https?|ftp|smtp):\\/\\/)?(www.)?[a-z0-9]+\\.[a-z]+(\\/[a-zA-Z0-9#]+\\/?)*$";
                    Pattern pattern = Pattern.compile(regularExpression);
                    Matcher matcher = pattern.matcher(url);

                    if (matcher.matches()){
                        viewBrowser.loadUrl("https://"+url);
                    }else {
                        viewBrowser.loadUrl("https://www.google.com/search?q=" +url);
                    }


                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        int i = 1;

        if (viewBrowser.canGoBack()){
            viewBrowser.goBack();
        }else {
            i++;
            if (i>=2){
            edtURL.setText(" ");
            createPopUpWindow();

            }else {
                super.onBackPressed();
            }

        }
    }

    private void createPopUpWindow(){
        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View popUpView = inflater.inflate(R.layout.exit_popup, null);



        int width = ViewGroup.LayoutParams.MATCH_PARENT;

        int height = ViewGroup.LayoutParams.WRAP_CONTENT;

        boolean focusable = true;

        PopupWindow popupWindow = new PopupWindow(popUpView, width, height, focusable);


        layout.post(new Runnable() {
            @Override
            public void run() {
                popupWindow.showAtLocation(layout, Gravity.CENTER, 0, 0);
            }
        });

        yes = popUpView.findViewById(R.id.btn_exit_yes);
        no = popUpView.findViewById(R.id.btn_exit_no);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindow.dismiss();
            }
        });
    }
}