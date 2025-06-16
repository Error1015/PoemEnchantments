package org.error1015.pe.util.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Getter
@Setter
@AllArgsConstructor(staticName = "of")
public class Pair<K, V> {
    private K key;
    private V value;

    /**
     * 通过pair构建map
     *
     * @param pairs 键值对
     * @param <K>   key
     * @param <V>   value
     * @return map
     */
    @SafeVarargs
    public static <K, V> @NotNull Map<K, V> mapOf(@NotNull Pair<K, V>... pairs) {
        var map = new HashMap<K, V>();

        for (var pair : pairs) {
            map.put(pair.getKey(), pair.getValue());
        }

        return map;
    }

    /**
     * 往map里面塞pair
     *
     * @param map   需要修改的map
     * @param pairs 需要添加的键值对
     * @param <K>   键
     * @param <V>   值
     * @return 更新后的map
     */
    @SafeVarargs
    public static <K, V> @NotNull Map<K, V> putMap(@NotNull Map<K, V> map, @NotNull Pair<K, V>... pairs) {
        for (var pair : pairs) {
            map.put(pair.getKey(), pair.getValue());
        }
        return map;
    }
}