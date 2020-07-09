package cn.gb.mysql2;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import com.bin.david.form.core.SmartTable;
import com.bin.david.form.core.TableConfig;
import com.bin.david.form.data.CellInfo;
import com.bin.david.form.data.format.bg.BaseCellBackgroundFormat;
import com.bin.david.form.data.style.FontStyle;
import com.bin.david.form.data.table.PageTableData;

import pojo.Student;

/**
 * 表格
 */
public class TableActivity extends AppCompatActivity {

    public static SmartTable<Student> table;
    public PageTableData<Student> tableData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        table = findViewById(R.id.table1);
//        设置放缩
        table.setZoom(true, 5, (float) 0.1);
        table.getConfig().setFixedXSequence(true);
        table.getConfig().setTableTitleStyle(new FontStyle(
                this, 15, getResources().getColor(R.color.colorAccent)));
        table.getConfig().setContentCellBackgroundFormat(new BaseCellBackgroundFormat<CellInfo>() {
            @Override
            public int getBackGroundColor(CellInfo cellInfo) {
                if (cellInfo.row % 2 == 0) {
                    return ContextCompat.getColor(TableActivity.this, R.color.arc_line);
                }
                return TableConfig.INVALID_COLOR;
            }

        });
        table.setData(MainActivity.list);

    }
}



