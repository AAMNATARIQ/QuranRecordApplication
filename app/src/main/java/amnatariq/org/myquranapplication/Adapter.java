package amnatariq.org.myquranapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<ModalClass> userList;

    public Adapter(List<ModalClass> userList){
        this.userList = userList;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        int resource = userList.get(position).getImageview1();
        String name = userList.get(position).getTextview1();
        String msg = userList.get(position).getTextview2();
        String status = userList.get(position).getTextview3();
        String line = userList.get(position).getDivider();

        holder.setData(resource,name,msg,status,line);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView textView1;
        private TextView textView2;
        private TextView textView3;
        private TextView divider;


        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageview1);
            textView1 = itemView.findViewById((R.id.textview));
            textView2 = itemView.findViewById((R.id.textview2));
            textView3 = itemView.findViewById((R.id.textview3));
            divider = itemView.findViewById((R.id.divider));
        }

        public void setData(int resource, String name, String msg, String status, String line) {
           imageView.setImageResource(resource);
            textView1.setText(name);
            textView3.setText(msg);
            textView2.setText(status);
            divider.setText(line);
        }
    }
}