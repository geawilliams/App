package a1708965.brunel.uk.ak.appv1;

import android.media.Image;

public class MessageConstructor {
    private Integer MID;
    private Integer LID;
    private String Message;
    private String date;
    private Image icon;

    public MessageConstructor(int m, int l, String Mes, String d){
        this.MID = m;
        this.LID = l;
        this.Message = Mes;
        this.date = d;
    }

    public String getMsg(){
        return Message;
    }
    public Integer getMID(){
        return MID;
    }
    public Integer getLID(){
        return LID;
    }
    public String getDate(){
        return date;
    }
    public Image getIcon(){
        return icon;
    }



}
