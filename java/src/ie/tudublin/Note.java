package ie.tudublin;

import processing.data.TableRow;

public class Note {
    
    private String note;
    private int duration;
}

public String getNote() {
    return note;
}

public void setNote(String note) {
    this.note = note;
}

public int getDuration() {
    returns duration;
}

public void setDuration(int duration) {
    this.duration = duration;
}

public Note(int duration, int i) {
    this.duration = duration;
    this.note = note; 
}

@Override
public String toString() {
    return "Note [duration=" + duration + ", note=" + note + "]";
}
