package lawrence.blooddonor.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import lawrence.blooddonor.R;

/**
 * Created by dubdabasoduba on 17/08/2017.
 */

public class BioDataTabFragment extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_bio_data, container, false);
	}
}
