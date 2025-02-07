package org.eternity.theater.step02;

public class Audience {
    private Bag bag; // 관객의 가방

    // 관객은 무조건 가방을 가져야 함
    public Audience(Bag bag) {
        this.bag = bag;
    }

    // 관객의 가방 조회
    public Bag getBag() {
        return bag;
    }
}
