package comqq.example.asus_pc.ad220;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private List<Dog> dogList=new ArrayList<Dog>();
    private MyAdapter mAdapter;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDogList();
        initViews();
    }

    private void initDogList() {
        dogList.add(new Dog("dog1",R.drawable.dog1));
        dogList.add(new Dog("dog2",R.drawable.dog2));
        dogList.add(new Dog("dog3",R.drawable.dog3));
        dogList.add(new Dog("dog4",R.drawable.dog4));
        dogList.add(new Dog("dog5",R.drawable.dog5));
        dogList.add(new Dog("dog6",R.drawable.dog6));
        dogList.add(new Dog("dog7",R.drawable.dog7));
        dogList.add(new Dog("dog8",R.drawable.dog8));
        dogList.add(new Dog("dog9",R.drawable.dog9));

    }

    private void initViews() {
        mRecyclerView= (RecyclerView) findViewById(R.id.recycleview);
       LinearLayoutManager manager=new LinearLayoutManager(this);
       manager.setOrientation(LinearLayoutManager.HORIZONTAL);
       // GridLayoutManager manager=new GridLayoutManager(this,3);

        //StaggeredGridLayoutManager manager=new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(manager);
        mAdapter =new MyAdapter(dogList);
        mRecyclerView.setAdapter(mAdapter);
    }
}
