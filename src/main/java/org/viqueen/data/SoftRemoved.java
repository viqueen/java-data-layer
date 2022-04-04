package org.viqueen.data;

import java.util.Date;

public interface SoftRemoved {
    Date getRemovedAt();
    boolean isRemoved();
}
