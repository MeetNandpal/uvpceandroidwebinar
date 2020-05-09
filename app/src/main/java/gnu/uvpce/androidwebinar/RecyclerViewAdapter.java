package gnu.uvpce.androidwebinar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter  extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private ArrayList<Model> dataSet;
    private Context mContext;

    public RecyclerViewAdapter(ArrayList<Model> data, Context mContext) {
        this.dataSet = data;
        this.mContext = mContext;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvName;
        TextView tvVersion;
        ImageView ivIcon;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.tvName = (TextView) itemView.findViewById(R.id.textViewName);
            this.tvVersion = (TextView) itemView.findViewById(R.id.textViewVersion);
            this.ivIcon = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        holder.tvName.setText(dataSet.get(position).getName());
        holder.tvVersion.setText(dataSet.get(position).getVersion());
        Glide.with(mContext).load(dataSet.get(position).getImage()).into(holder.ivIcon);
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
