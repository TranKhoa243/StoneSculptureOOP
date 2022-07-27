package com.example.stonesculptureoop.view.statueoflibertyfragment.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.stonesculptureoop.R;
import com.example.stonesculptureoop.model.LionStatue;
import com.example.stonesculptureoop.model.StatueOfLiberty;
import com.example.stonesculptureoop.view.lionstatuefragment.adapter.LionStatueAdapter;

import java.util.List;

public class StatueOfLibertyAdapter extends RecyclerView.Adapter<StatueOfLibertyAdapter.StatueOfLibertyViewHolder>{

    private List<StatueOfLiberty> statueOfLibertyList;

    public void setData(List<StatueOfLiberty> list){
        this.statueOfLibertyList =list;

        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public StatueOfLibertyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lion_statue_fragment,parent,false);
        return new StatueOfLibertyAdapter.StatueOfLibertyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StatueOfLibertyViewHolder holder, int position) {
        final StatueOfLiberty statueOfLiberty = statueOfLibertyList.get(position);
        if(statueOfLiberty ==null){
            return;
        }
        holder.tvLionStatueName.setText("ID:"+statueOfLiberty.getId()+"  Name:"+statueOfLiberty.getStoneSculptureName());
        holder.tvPriceWeightLionStatue.setText("Price:"+statueOfLiberty.getPrice()+"  Weight"+statueOfLiberty.getStoneSculptureWeight());
        holder.imageLionStatue.setImageResource(R.drawable.statueofliberty);
        if(Integer.valueOf(statueOfLiberty.getStoneSculptureWeight())>50){
            holder.imageBox.setImageResource(R.drawable.boxrectangle);
        }
        else {
            holder.imageBox.setImageResource(R.drawable.boxsquare);
        }
    }

    @Override
    public int getItemCount() {
        return statueOfLibertyList!= null? statueOfLibertyList.size():0;
    }

    public class StatueOfLibertyViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageLionStatue,imageBox;
        private TextView tvLionStatueName, tvPriceWeightLionStatue;

        public StatueOfLibertyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageLionStatue=itemView.findViewById(R.id.image_lion_statue );
            imageBox=itemView.findViewById(R.id.image_box );
            tvLionStatueName=itemView.findViewById(R.id.tv_lion_statue_name );
            tvPriceWeightLionStatue=itemView.findViewById(R.id.tv_price_weight_lion_statue );
        }
    }
}
