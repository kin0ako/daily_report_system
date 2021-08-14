package services;

import javax.persistence.EntityManager;

import utils.DBUtil;

/**
 * DB接続に関わる共通処理を行うクラス
 */
//SQL実行に共通で必要となる EntityManager インスタンスの作成やクローズ処理を実装
public class ServiceBase {

    /**
     * EntityManagerインスタンス
     */
    protected EntityManager em = DBUtil.createEntityManager();

    /**
     * EntityManagerのクローズ
     */
    public void close() {
        if (em.isOpen()) {
            em.close();
        }
    }
}
