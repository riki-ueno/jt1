package drill.step08;

import java.util.HashMap;
import java.util.Map;

/**
 * Map問題
 *
 * [キーワード]java, map, hashmap
 *
 * @author mano
 *
 */
public class Map01 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("JAPAN", "TOKYO");
		// =======================================================
		// 出力例
		// =======================================================
		// japan
		// null
		System.out.println(getFromMap(map, "JAPAN"));
		System.out.println(getFromMap(map, "USA"));

	}

	/**
	 * マップを指定されたキーで取得しなさい
	 *
	 * @param map マップ
	 * @param key 検索キー
	 */
	public static String getFromMap(Map<String, String> map, String key) {
		// TODO: 実装せよ
		// 普通にやると1行だけになります
		//-----↓実装ここから↓-------

		//-----↑実装ここまで↑-------
	}

}
