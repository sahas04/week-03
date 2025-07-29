package com.revature.livelock;

class Friend {
    private final String name;
    private boolean bowing = false;

    Friend(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public synchronized void bow(Friend other) {
        if (other.bowing) {
            System.out.println(name + ": You bow first, " + other.getName());
            return;
        }

        bowing = true;
        System.out.println(name + ": bowing to " + other.getName());
        other.bowBack(this);
        bowing = false;
    }

    public synchronized void bowBack(Friend other) {
        System.out.println(name + ": bowing back to " + other.getName());
    }
}

