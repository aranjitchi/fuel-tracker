package pt.sac.tracker.fuel.domain;

import java.io.Serializable;

@FunctionalInterface
public interface Identifiable<T extends Serializable> {

    T getId();
}
