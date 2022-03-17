package heroes;

public enum SkinColor {
    BLACK("афроамериканец"),
    WHITE("европеоид"),
    ALBO("альбинос"),
    CHINESE("монголоид");

    private final String skinColor;
    SkinColor(String skinColor){
        this.skinColor=skinColor;
    }
    public String getSkinColor(){
        return skinColor;
    }
}
