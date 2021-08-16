package service;

import model.VonTu;

import java.util.ArrayList;

public class ListVonTu {
    public ArrayList<VonTu> list=new ArrayList<>();
    public ListVonTu(){
        list.add(new VonTu("helo","chao"));
        list.add(new VonTu("goodbye","tambiet"));
        list.add(new VonTu("like","toi thich em"));
        list.add(new VonTu("near","canh ben toi"));
    }
}
