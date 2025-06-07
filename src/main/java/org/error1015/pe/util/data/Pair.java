package org.error1015.pe.util.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor(staticName = "of")
public class Pair<K, V> {
    private K key;
    private V value;
}