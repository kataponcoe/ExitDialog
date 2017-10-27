package com.ndasmohsquad.exitdialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
 
public class MainActivity extends Activity implements OnClickListener {

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}
		
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		
		}
	

@Override
public void onBackPressed() {
	// TODO Auto-generated method stub
	keluar();
}

private void keluar() {

	AlertDialog.Builder builder = new AlertDialog.Builder(this);
	builder.setMessage("Apakah Anda Yakin ingin Keluar?")
			.setCancelable(false)
			// tidak bisa tekan tombol back
			// jika pilih yess
			.setPositiveButton("Iya",
					new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							// this.finish();

							MainActivity.this.finish();
						}

						private void finish() {
							// TODO Auto-generated method stub

						}
					})
			// jika pilih no
			.setNegativeButton("Tidak",
					new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							dialog.cancel();
						}
					}).show();

}
}