package org.example;

public class Discography {
    private int no;
    private String name;
    private String label;

    //コンストラクター
    public Discography(int no, String name, String label) {
        this.no = no;
        this.name = name;
        this.label = label;
    }


    //ゲッター
    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public String getLabel() {
        return label;
    }


    //セッター
    public void setName(String name) {
        this.name = name;
    }

    public void setLabel(String label) {
        this.label = label;
    }


    //クラス専用メソッド
    public String schedule() {
        return "次のリリース予定は「" + this.name + "」です。レーベルは" + this.label + "です。";
    }
}
