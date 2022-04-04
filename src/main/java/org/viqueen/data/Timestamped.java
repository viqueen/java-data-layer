package org.viqueen.data;

import java.util.Date;

public interface Timestamped {
    Date getCreatedAt();
    Date getUpdatedAt();
}
