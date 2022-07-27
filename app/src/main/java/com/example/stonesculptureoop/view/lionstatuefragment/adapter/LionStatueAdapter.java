package com.example.stonesculptureoop.view.lionstatuefragment.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.stonesculptureoop.R;
import com.example.stonesculptureoop.model.LionStatue;

import java.util.List;

public class LionStatueAdapter extends RecyclerView.Adapter<LionStatueAdapter.LionStatueViewHolder>{

    private List<LionStatue> lionStatueList;

    public void setData(List<LionStatue> list){
        this.lionStatueList =list;

        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public LionStatueViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lion_statue_fragment,parent,false);
        return new LionStatueViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LionStatueViewHolder holder, int position) {
        final LionStatue lionStatue = lionStatueList.get(position);
        if(lionStatue ==null){
            return;
        }
        holder.tvLionStatueName.setText("ID:"+lionStatue.getId()+"  Name:"+lionStatue.getStoneSculptureName());
        holder.tvPriceWeightLionStatue.setText("Price:"+lionStatue.getPrice()+"  Weight"+lionStatue.getStoneSculptureWeight());
        holder.imageLionStatue.setImageResource(R.drawable.lionstatues);
        if(Integer.valueOf(lionStatue.getStoneSculptureWeight())>50){
            holder.imageBox.setImageResource(R.drawable.boxrectangle);
        }
        else {
            holder.imageBox.setImageResource(R.drawable.boxsquare);
        }
    }

    @Override
    public int getItemCount() {
        return lionStatueList!= null? lionStatueList.size():0;
    }

    public class LionStatueViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageLionStatue,imageBox;
        private TextView tvLionStatueName, tvPriceWeightLionStatue;

        public LionStatueViewHolder(@NonNull View itemView) {
            super(itemView);
            imageLionStatue=itemView.findViewById(R.id.image_lion_statue );
            imageBox=itemView.findViewById(R.id.image_box );
            tvLionStatueName=itemView.findViewById(R.id.tv_lion_statue_name );
            tvPriceWeightLionStatue=itemView.findViewById(R.id.tv_price_weight_lion_statue );
        }
    }
}
