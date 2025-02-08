package com.rxmobileteam.lecture11

import com.rxmobileteam.utils.ExerciseNotCompletedException
import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.TimeUnit

object Riddle26 {
  /**
   * Delay each emission of the [source] by 300 milliseconds.
   *
   * Use case: Delay emission of events to simulate some indication.
   */
  fun solve(source: Observable<Long>): Observable<Long> {
    return source.delay(300, TimeUnit.MILLISECONDS)
  }
}
