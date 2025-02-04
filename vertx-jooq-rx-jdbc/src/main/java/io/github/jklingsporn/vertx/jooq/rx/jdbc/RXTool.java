package io.github.jklingsporn.vertx.jooq.rx.jdbc;

import io.vertx.core.Handler;
import io.vertx.reactivex.core.Promise;
import io.vertx.reactivex.core.Vertx;
import io.reactivex.Observable;
import io.reactivex.Single;

import java.util.List;

/**
 * @author <a href="http://escoffier.me">Clement Escoffier</a>
 */
public class RXTool {
    private RXTool() {
    }


    public static <T> Single<T> executeBlocking(Handler<Promise<T>> blockingCodeHandler, Vertx
        vertx) {
        if (vertx.getOrCreateContext().isOnWorkerThread()) {
          Promise<T> cf = Promise.promise();
          blockingCodeHandler.handle(cf);
          return Single.just(cf.future().result());
        }
        return vertx.rxExecuteBlocking(blockingCodeHandler,false).toSingle();
    }

    public static <T> Observable<T> executeBlockingObservable(Handler<Promise<List<T>>> blockingCodeHandler, Vertx
        vertx) {
        return executeBlocking(blockingCodeHandler,vertx)
                .flatMapObservable(Observable::fromIterable);
    }



    public static <T> Single<T> failure(Throwable e) {
        return Single.error(e);
    }


}
