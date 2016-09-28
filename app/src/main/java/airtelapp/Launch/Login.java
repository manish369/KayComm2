package airtelapp.Launch;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import com.example.a369.airtelapp.R;

public class Login extends Activity {
    EditText uname,pwd;
    Button login,register;
    Switch aSwitch;
    TextView forget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        uname=(EditText)findViewById(R.id.txt_username);
        pwd=(EditText)findViewById(R.id.txt_pass);
        register=(Button)findViewById(R.id.btn_register);
        login=(Button)findViewById(R.id.btn_login);
        aSwitch=(Switch)findViewById(R.id.switch1);
        forget=(TextView)findViewById(R.id.txt_forget);
    }
}
