package edwardbil_soundboard.gkain.edwardbil;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecretFragment extends Fragment {


    public SecretFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Toast toast = Toast.makeText(getActivity(),
                "Вы перешли в Secret Soundboard", Toast.LENGTH_SHORT);
        toast.show();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_secret, container, false);
    }

}
