package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Discography> albumList = List.of(
                new Discography(1, "chronicle", "自主制作"),
                new Discography(2, "Thanatos", "自主制作"),
                new Discography(3, "Lost", "自主制作"),
                new Discography(4, "Elysion", "キングレコード"),
                new Discography(5, "Roman", "キングレコード"),
                new Discography(6, "Moira", "キングレコード"),
                new Discography(7, "Marchen", "キングレコード"),
                new Discography(8, "Rinne", "未定"),
                new Discography(9, "bastet", "ポニーキャニオン"));


        System.out.println("【Discograpy】");

        for (Discography album : albumList) {
            System.out.println(album.getNo() + "th Story " + album.getName() + "　レーベル:" + album.getLabel());
        }

        albumList.get(8).setName("Nein");
        System.out.println("【Information】");
        System.out.println(albumList.get(8).getNo() + "番目のアルバム名は「" + albumList.get(8).getName() + "」に変更されました。");
        System.out.println("更新後；" + albumList.get(8).getNo() + "th Story " + albumList.get(8).getName());

        String schedule = albumList.get(7).schedule();
        System.out.println(schedule);


        System.out.println("自主制作の作品は");
        for (Discography album : albumList) {
            if (album.getLabel().equals("自主制作")) {
                System.out.println("「" + album.getName() + "」");
            }
        }
        System.out.println("です。");
    }

}
