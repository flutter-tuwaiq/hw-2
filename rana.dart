
void main() {
    var la = "*";
    int ran = 3;

    for (int i = 0; i < 9; i++){
        if(i < 4)
        {
            print(la); la += "*";
        }
        else if(ran > 0)
        {
            print(la.substring(la.length -ran)); ran--;
            }
        }
}
