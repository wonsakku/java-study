package org.example.chap07;

public class StubeWeakPasswordChecker implements WeakPasswordChecker {

    private boolean weak;

    public StubeWeakPasswordChecker() {
        this.weak = true;
    }

    public void setWeak(boolean weak) {
        this.weak = weak;
    }

    @Override
    public boolean checkPasswordWeak(String pw) {
        return weak;
    }


}
