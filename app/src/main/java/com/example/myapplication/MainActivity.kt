//Lập trình ứng dụng quản lý sinh viên:
//+ Hiển thị danh sách sinh viên với 2 thông tin gồm Họ tên và MSSV. Giao diện tương tự trên bảng.
//+ Thêm giao diện cho phép người dùng nhập sinh viên mới, chèn vào đầu danh sách.
//+ Thêm giao diện cho phép xóa sinh viên.
//Yêu cầu nộp:
//+ Link Github
//+ Ảnh chụp màn hình kết quả chạy thử

package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val students = mutableListOf<`student-model`>()
        repeat(28) {
            students.add(`student-model`(
                hoten = "ten sv $it",
                mssv = "MSSV $it"
            ))
        }

        val adapter = studentAdapter(students)

        val listStudents = findViewById<RecyclerView>(R.id.student_list)
        listStudents.adapter = adapter



    }
}