package io.bigbearbro.eos4j;

import io.bigbearbro.eos4j.api.result.PushTransactionResults;

/**
 * @author zuz
 * @date 2019/5/22 9:27 PM
 * @description
 */
public class EosTest {

    private static final String PRIVATE_KEY = "*";
    private static final String ACCOUNT_FORM = "*";
    //    private static final String CONTRACT_ACCOUNT = "eosluckcoin1";
    private static final String CONTRACT_ACCOUNT = "games.eos";

    public static void main(String[] args) throws Exception {
        Eos4j eos4j = new Eos4j("https://api.eosbeijing.one");
//        PushTransactionResults results = eos4j.transfer(PRIVATE_KEY, CONTRACT_ACCOUNT, ACCOUNT_FORM, "luck.eos", "0.0001 LUCK", "");
//        System.out.println(results.getTransactionId());

        // 调用合约
        PushTransactionResults results1 = eos4j.contract(PRIVATE_KEY, CONTRACT_ACCOUNT, ACCOUNT_FORM, ACCOUNT_FORM, "A:1-B:1-C:1-D:1-E:1-F:1-G:1-H:1");
        System.out.println(results1.getTransactionId());
    }
}
