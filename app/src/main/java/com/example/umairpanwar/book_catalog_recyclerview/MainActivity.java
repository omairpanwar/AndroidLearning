package com.example.umairpanwar.book_catalog_recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Context context;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.context=this;
        recyclerView = findViewById(R.id.mainRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        OurAdapter adapter = new OurAdapter();
        recyclerView.setAdapter(adapter);

    }
    public class OurAdapter extends RecyclerView.Adapter<OurAdapter.ViewHolder> {
        DataModel [] dataModels = new DataModel[10];

        public OurAdapter() {
            dataModels[0] = new DataModel("Math","Umair",55588,2452017,R.drawable.a);
            dataModels[1] = new DataModel("English","Adil",553155,24565,R.drawable.b);
            dataModels[2] = new DataModel("Mathdsd","Umaissdr",5555,2455,R.drawable.c);
            dataModels[3] = new DataModel("Matxjh","Ummcbair",55565,24651,R.drawable.d);
            dataModels[4] = new DataModel("Machth","Umsdair",55685,26514,R.drawable.e);
            dataModels[5] = new DataModel("Matsndcbh","Umahgdcir",55545,24351,R.drawable.f);
            dataModels[6] = new DataModel("Masdcth","Umasdir",553515,24936,R.drawable.g);
            dataModels[7] = new DataModel("Matsdch","Umsdcair",556515,24651,R.drawable.i);
            dataModels[8] = new DataModel("Mascth","Usdcmair",55515,26434,R.drawable.j);
            dataModels[9] = new DataModel("Msdcath","Umsdcair",65555,2464,R.drawable.h);

        }

        @NonNull
        @Override
        public OurAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.recylerview,parent,false));
        }

        @Override
        public void onBindViewHolder(@NonNull OurAdapter.ViewHolder holder, int position) {
            DataModel item = dataModels[position];
            holder.textViewbook.setText(item.getBookname());
            holder.textViewname.setText(item.getAuthorname());
            holder.textViewdate.setText(String.valueOf(item.getDate()));
            holder.textViewcode.setText(String.valueOf(item.getCode()));
            holder.imageView.setImageResource(item.getImage());

        }

        @Override
        public int getItemCount() {
            return dataModels.length;
        }
        public class ViewHolder extends RecyclerView.ViewHolder{

            TextView textViewbook;
            TextView textViewname;
            TextView textViewdate;
            TextView textViewcode;
            ImageView imageView;

            public ViewHolder(View itemView) {
                super(itemView);
                imageView = itemView.findViewById(R.id.mainImageView);
                textViewbook = itemView.findViewById(R.id.mainTextView);
                textViewname = itemView.findViewById(R.id.mainTextView2);
                textViewcode = itemView.findViewById(R.id.mainTextView3);
                textViewdate = itemView.findViewById(R.id.mainTextView4);
            }
        }
    }
    public class DataModel{
        private String bookname;
        private String authorname;
        private int code;
        private int date;
        private int image;

        public DataModel(String bookname, String authorname, int code, int date, int image) {
           this.bookname = bookname;
            this.authorname = authorname;
            this.code = code;
            this.date = date;
            this.image = image;
        }

        public String getBookname() {
            return bookname;
        }

        public void setBookname(String bookname) {
            this.bookname = bookname;
        }

        public String getAuthorname() {
            return authorname;
        }

        public void setAuthorname(String authorname) {
            this.authorname = authorname;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public int getDate() {
            return date;
        }

        public void setDate(int date) {
            this.date = date;
        }

        public int getImage() {
            return image;
        }

        public void setImage(int image) {
            this.image = image;
        }
    }
}
