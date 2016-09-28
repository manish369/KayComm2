package airtelapp.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a369.airtelapp.R;

/**
 * Created by 369 on 23-Aug-16.
 */
public class Feedback extends Fragment {
    View res;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        res=inflater.inflate(R.layout.feedback, container, false);
        return res;
    }
}
