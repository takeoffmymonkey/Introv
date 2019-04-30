package com.galukhin.introv.model;

import java.math.BigDecimal;
import java.util.List;

public class Note {
    long created;
    long edited;

    List<Long> contains; // TODO: 030 30 апр 19 or better store a link?
    long containedIn;

    boolean colorOn,
            imageOn,
            priorityOn,
            completeOn,
            tagsOn,
            commentsOn,
            commentsDefaultTypeOn, // when auto-edit is on comment
            nameOn,
            moneyOn,
            valueOn,
            durationOn,
            customOptionOn,
            remindersOn,
            editOnOpenOn; // field to focus/start editing when open

    byte color;
    byte image;
    byte priority;
    boolean complete;
    List<String> tags;
    List<String> comments;
    String name;
    BigDecimal money;
    double value;
    long duration;
    byte customOption;
    List<Long> reminders; // make reoccurring
    byte editOnOpen;
    byte commentsDefaultType;
}