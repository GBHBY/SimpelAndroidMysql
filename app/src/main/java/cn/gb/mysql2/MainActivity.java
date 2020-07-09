package cn.gb.mysql2;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.qmuiteam.qmui.widget.dialog.QMUIDialog;

import java.util.ArrayList;
import java.util.List;

import dao.StudentDao;
import dao.StudentDaoImp;
import pojo.Student;

public class MainActivity extends Activity {

    String[] items = new String[]{"学号", "班级", "姓名", "门牌号"};
    String[] allCollegeNameItems = new String[12];
    String[] allDormitoryItems = new String[10];
    String[] allClassItems = new String[10];
    String[] allDormItems = new String[20];


    boolean flagCo = true;
    boolean flagCl = true;
    boolean flagDorm = true;
    boolean flagDo = true;

    static List<Student> list = new ArrayList<>();


    final int checkedIndex = 1;
    //查询方式
    String queryMethod;

    //定义Toast显示时间属性
    final int s = Toast.LENGTH_SHORT;


    StudentDao st = new StudentDaoImp();
    final static List<String> allClassName = new ArrayList<>();
    final static List<String> allCollegeName = new ArrayList<>();
    final static List<String> allDormitoryName = new ArrayList<>();
    final static List<String> allDorm = new ArrayList<>();


    private ImageView mArrowIv;

    private EditText stuId;
    private EditText stuClass;
    private EditText stuName;
    private EditText stuDormitory;
    private EditText stuDorm;
    private EditText stuCollege;

    private EditText selectBtu;

    public String id;
    public String className;
    public String name;
    public String dorm;
    public String dormitory;
    public String college;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        stuDormitory = findViewById(R.id.stuDormitory);
        stuDorm = findViewById(R.id.stuDorm);
        stuCollege = findViewById(R.id.stuCollege);
        stuClass = findViewById(R.id.stuClass);
        stuId = findViewById(R.id.stuId);
        stuName = findViewById(R.id.stuName);

        selectBtu = findViewById(R.id.queryMethod);


        getAllCollegeName();
        stuCollege.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (flagCo) {
                    new QMUIDialog.CheckableDialogBuilder(MainActivity.this)
                            .setTitle("选择学院")
                            .addItems(allCollegeNameItems, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(MainActivity.this, "你选择了 " + allCollegeNameItems[which], Toast.LENGTH_SHORT).show();
                                    stuCollege.setText(allCollegeNameItems[which]);
                                    dialog.dismiss();
                                }
                            })
                            .show();
                }

            }
        });


        getDormitoryNameData();
        stuDormitory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flagDo) {
                    new QMUIDialog.CheckableDialogBuilder(MainActivity.this)
                            .setTitle("选择公寓楼")
                            .addItems(allDormitoryItems, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(MainActivity.this, "你选择了 " + allDormitoryItems[which], Toast.LENGTH_SHORT).show();
                                    stuDormitory.setText(allDormitoryItems[which]);
                                    dialog.dismiss();
                                }
                            })
                            .show();
                }


            }
        });


        getClassNameData();
        stuClass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flagCl) {
                    new QMUIDialog.CheckableDialogBuilder(MainActivity.this)
                            .setTitle("选择班级")
                            .addItems(allClassItems, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(MainActivity.this, "你选择了 " + allClassItems[which], Toast.LENGTH_SHORT).show();
                                    stuClass.setText(allClassItems[which]);
                                    dialog.dismiss();
                                }
                            })
                            .show();
                }


            }
        });


        getDormData();
        stuDorm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flagDorm) {
                    new QMUIDialog.CheckableDialogBuilder(MainActivity.this)
                            .setTitle("选择门牌号")
                            .addItems(allDormItems, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(MainActivity.this, "你选择了 " + allDormItems[which], Toast.LENGTH_SHORT).show();
                                    stuDorm.setText(allDormItems[which]);
                                    dialog.dismiss();
                                }
                            })
                            .show();

                }
            }
        });


        if (selectBtu.getText().toString().equals("")) {
            stuName.setFocusable(false);
            stuId.setFocusable(false);
            flagCo = false;
            flagCl = false;
            flagDo = false;
            flagDorm = false;

        }
    }

    /**
     * 获取所有班级名字
     */
    public void getClassNameData() {
        allClassName.clear();
        new Thread(new Runnable() {
            @Override
            public void run() {
                if (st.getAllClassName().toString().equals("[]")) {
                    Looper.prepare();
                    Toast.makeText(getApplicationContext(), "班级网络错误", s).show();
                    Looper.loop();
                } else {
                    allClassName.addAll(st.getAllClassName());
                    for (int i = 0; i < allClassName.size(); i++) {
                        allClassItems[i] = allClassName.get(i);

                    }
                }
                Log.v(allClassName.toString(), "ssssss");
            }
        }).start();
    }

    /**
     * 获取所有宿舍楼
     */
    public void getDormitoryNameData() {
        allDormitoryName.clear();
        new Thread(new Runnable() {
            @Override
            public void run() {
                if (st.getAllDomiotry().toString().equals("[]")) {
                    Looper.prepare();
                    Toast.makeText(getApplicationContext(), "宿舍楼网络错误", s).show();
                    Looper.loop();
                } else {
                    allDormitoryName.addAll(st.getAllDomiotry());
                    for (int i = 0; i < allDormitoryName.size(); i++) {
                        allDormitoryItems[i] = allDormitoryName.get(i);

                    }
                }
                Log.v(allDormitoryName.toString(), "ssssss");
            }
        }).start();
    }

    /**
     * 获取所有的门牌号
     */

    public void getDormData() {
        allDorm.clear();
        new Thread(new Runnable() {
            @Override
            public void run() {
                if (st.getAllDom().toString().equals("[]")) {
                    Looper.prepare();
                    Toast.makeText(getApplicationContext(), "门牌号网络错误", s).show();
                    Looper.loop();
                } else {
                    allDorm.addAll(st.getAllDom());
                    for (int i = 0; i < allDorm.size(); i++) {
                        allDormItems[i] = allDorm.get(i);

                    }
                }
            }
        }).start();

    }


    /**
     * 获取所有的学院名称
     */
    public void getAllCollegeName() {
        allCollegeName.clear();

        new Thread(new Runnable() {
            @Override
            public void run() {
                if (st.getAllCollegeName().toString().equals("[]")) {
                    Looper.prepare();
                    Toast.makeText(getApplicationContext(), "学院网络错误", s).show();
                    Looper.loop();
                } else {
                    allCollegeName.addAll(st.getAllCollegeName());
                    for (int i = 0; i < allCollegeName.size(); i++) {
                        allCollegeNameItems[i] = allCollegeName.get(i);
                    }
                }

            }
        }).start();
    }


    /**
     * @param view
     */
    public void click1(View view) {


        new QMUIDialog.CheckableDialogBuilder(MainActivity.this)
                .addItems(items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        queryMethod = items[which];
                        selectBtu.setText(queryMethod);
                        if (items[which].equals("学号")) {
                            stuId.setFocusableInTouchMode(true);
                            stuName.setFocusable(false);
                            flagCo = false;
                            flagCl = false;
                            flagDo = false;
                            flagDorm = false;
                            stuId.setText("");
                            stuName.setText("");
                            stuClass.setText("");
                            stuCollege.setText("");
                            stuDormitory.setText("");
                            stuDorm.setText("");

                        } else if (items[which].equals("姓名")) {
                            stuName.setFocusableInTouchMode(true);
                            stuId.setFocusable(false);
                            flagCo = true;
                            flagCl = false;
                            flagDo = false;
                            flagDorm = false;
                            stuId.setText("");
                            stuName.setText("");
                            stuClass.setText("");
                            stuCollege.setText("");
                            stuDormitory.setText("");
                            stuDorm.setText("");


                        } else if (items[which].equals("班级")) {
                            stuName.setFocusable(false);
                            stuId.setFocusable(false);
                            flagCo = true;
                            flagCl = true;
                            flagDo = false;
                            flagDorm = false;
                            stuId.setText("");
                            stuName.setText("");
                            stuClass.setText("");
                            stuCollege.setText("");
                            stuDormitory.setText("");
                            stuDorm.setText("");

                        } else if (items[which].equals("门牌号")) {
                            flagCo = false;
                            flagCl = false;
                            flagDo = true;
                            flagDorm = true;
                            stuId.setText("");
                            stuName.setText("");
                            stuClass.setText("");
                            stuCollege.setText("");
                            stuDormitory.setText("");
                            stuDorm.setText("");
                            stuName.setFocusable(false);
                            stuId.setFocusable(false);

                        }


                        dialog.dismiss();
                    }
                })
                .show();


    }


    public void onSelect1(View view) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Log.v("aaaaa", "dddd");

                if (selectBtu.getText().toString().equals("学号")) {
                    Log.v("selectBtu.getText()", "dddd");

                    list.clear();
                    if (st.getMassageByID(stuId.getText().toString()).toString().equals("[]")) {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(getApplicationContext(), "输入信息有误", s).show();
                            }
                        });
                    } else {

                        list.addAll(st.getMassageByID(stuId.getText().toString()));
                        Log.v(list.toString(), "ddddd");
                        Intent intent = new Intent(MainActivity.this, TableActivity.class);
                        startActivity(intent);
                    }


                } else if (selectBtu.getText().toString().equals("班级")) {
                    Log.v("班级", "dddd");

                    list.clear();
                    if (st.getMassageByclassName(stuClass.getText().toString()).toString().equals("[]")) {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(getApplicationContext(), "输入信息有误", s).show();
                            }
                        });
                    } else {
                        list.addAll(st.getMassageByclassName(stuClass.getText().toString()));
                        Log.v(list.toString(), "");
                        Intent intent = new Intent(MainActivity.this, TableActivity.class);
                        startActivity(intent);

                    }


                } else if (selectBtu.getText().toString().equals("姓名")) {
                    list.clear();
                    Log.v("姓名", "dddd");

                    if (st.getMassageByName(stuName.getText().toString(), stuCollege.getText().toString()).toString().equals("[]")) {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(getApplicationContext(), "输入信息有误", s).show();
                            }
                        });
                    } else {
                        list.addAll(st.getMassageByName(stuName.getText().toString(), stuCollege.getText().toString()));
                        Log.v(list.toString(), "");
                        Intent intent = new Intent(MainActivity.this, TableActivity.class);
                        startActivity(intent);
                    }


                } else if (selectBtu.getText().toString().equals("门牌号")) {
                    list.clear();
                    Log.v("门牌号", "dddd");

                    if (st.getMassageBydormitory(stuDorm.getText().toString(), stuDormitory.getText().toString()).toString().equals("[]")) {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(getApplicationContext(), "输入信息有误", s).show();
                            }
                        });

                    } else {
                        list.addAll(st.getMassageBydormitory(stuDorm.getText().toString(), stuDormitory.getText().toString()));
                        Log.v(list.toString(), "dsdsdsd");
                        Intent intent = new Intent(MainActivity.this, TableActivity.class);
                        startActivity(intent);


                    }


                }


            }
        }).start();


    }

}


