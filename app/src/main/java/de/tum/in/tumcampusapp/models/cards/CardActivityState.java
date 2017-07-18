package de.tum.in.tumcampusapp.models.cards;

import java.util.ArrayList;

public class CardActivityState {
    // TODO rethink all states
    public enum CardState {
        OVERVIEW, SEARCH, DELETE, ADD
    }

    public enum BoxFilter {
        ALL_CARDS, ALL_BOXES, SELECTED_BOXES
    }

    public enum LectureFilter {
        ALL_LECTURES, OWN_LECTURES, SELECTED_LECTURES
    }

    public CardState state;
    public BoxFilter boxFilter;
    public ArrayList<Integer> selectedBoxes;
    public LectureFilter lectureFilter;
    public ArrayList<Integer> selectedLectures;

    public CardActivityState() {
        this.state = CardState.OVERVIEW;
        this.boxFilter = BoxFilter.ALL_BOXES;
        this.selectedBoxes = new ArrayList<>();
        this.lectureFilter = LectureFilter.OWN_LECTURES;
        this.selectedLectures = new ArrayList<>();
    }
}
