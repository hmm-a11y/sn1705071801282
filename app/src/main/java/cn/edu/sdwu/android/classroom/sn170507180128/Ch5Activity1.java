package cn.edu.sdwu.android.classroom.sn170507180128;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.view.Gravity.CENTER;
import static android.widget.Toast.LENGTH_SHORT;

public class Ch5Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout_ch5_1);

    }

    public  void  toast1(View view){
        Toast.makeText(this, "toas1", LENGTH_SHORT).show();
    }

    public void toast2(View view){
        Toast toast=Toast.makeText(this,"toast2",Toast.LENGTH_LONG);
        toast.setGravity(CENTER,0,0);
        toast.show();
    }
    public void toast3(View view){
        //加载自定义的布局文件
        LayoutInflater layoutInflater=getLayoutInflater();
        View view1=layoutInflater.inflate(R.layout.layout_toast,null);
       //设置显示的文本
       TextView textView=(TextView) view1.findViewById(R.id.toast_tv);
        textView.setText("toast3");

        Toast toast=new Toast(this);
        toast.setView(view1);
       toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER,0,0);
      toast.show();
    }
}
