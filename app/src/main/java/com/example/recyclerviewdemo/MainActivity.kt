package com.example.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.recyclerviewdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var adapter: RecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


//        binding.recyclerView.layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        binding.recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val list = ArrayList<DataItem>()

        list.add(DataItem("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg", "Sample 1"))
        list.add(DataItem("https://render.fineartamerica.com/images/images-profile-flow/400/images-medium-large-5/awesome-solitude-bess-hamiti.jpg", "Sample 2"))
        list.add(DataItem("https://images.fineartamerica.com/images/artworkimages/mediumlarge/2/lonely-tree-in-tuscany-borchee.jpg", "Sample 3"))
        list.add(DataItem("https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/be1361d8-ce66-4f2f-aa92-d52b5fadea58/d4ajoef-fec574f4-5d22-44a6-b302-f13e5bcffba2.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcL2JlMTM2MWQ4LWNlNjYtNGYyZi1hYTkyLWQ1MmI1ZmFkZWE1OFwvZDRham9lZi1mZWM1NzRmNC01ZDIyLTQ0YTYtYjMwMi1mMTNlNWJjZmZiYTIuanBnIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.K6UEvX5zrUNX606g4fNmB9Yvu4hwKjunJcLPIDvQ_9Y", "Sample 4"))
        list.add(DataItem("https://media.istockphoto.com/photos/wild-grass-in-the-mountains-at-sunset-picture-id1322277517?k=20&m=1322277517&s=612x612&w=0&h=ZdxT3aGDGLsOAn3mILBS6FD7ARonKRHe_EKKa-V-Hws=", "Sample 5"))
        list.add(DataItem("https://www.gardeningknowhow.com/wp-content/uploads/2020/11/yellow-sunflower-field.jpg", "Sample 6"))
        list.add(DataItem("https://petapixel.com/assets/uploads/2022/07/DALLEcopy.jpg", "Sample 7"))

        adapter = RecyclerViewAdapter(this, list)

        binding.recyclerView.adapter = this.adapter


        binding.moveButton.setOnClickListener {
            binding.recyclerView.smoothScrollToPosition(2)
        }
    }
}