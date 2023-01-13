## Chapter 1. Introduction


<blockquote>
<h1>What is concurrency?</h1>
<blockquote>
- Concurrency in Java is the ability to run multiple tasks or threads simultaneously. It allows you to take advantage
of multi-core processors to improve the performance of your applications.
</blockquote>

<p>In the past, CPUs and Operating Systems were only able
to operate a single process over time. This proved to be
time consuming and quite annoying to end users. Programs had</p>
to run synchronous and could not operate asynchronous.


<p>Concurrency, allows programs to take advantage of CPUs</p>
by running multithreaded and asynchronous.


</blockquote>

<blockquote>
<h1>Threads?</h1>
<blockquote>
- Threads "often called lightweight processors" are treated as a basic unit of scheduling.

Threads execute asynchronously and simultaneously with respect to one another.
</blockquote>

<h3>Benefits of Threads</h3>
- Reduce development and maintenance costs
- Turn convoluted code into straight-line maintainable code
- Improve responsiveness of GUI applications
- Simplify the implementation of the JVM

<h3>Risks of threads</h3>
- Multiple threads could cause race conditions
- Multiple threads can cause deadlocks
- Concurrency now becomes an essential topic for developers to learn

<h3>Safety Hazards</h3>
Thread safety fails to occur when there is insufficient synchronization upon
multiple threads.

In the *UnsafeSequence* example, this showcases how a multithreaded environment
can behave unexpectedly. The issue in *UnsafeSequence* is that two threads could call <code>getNext()</code> and receive the same value.
This would result in each thread reading the same value and then incrementing the same value. This scenario is
known as a **race condition**.


Since threads share the same memory address and run concurrently they can also access or modify variables that other 
threads are using. In order to prevent nonsequentiality in a sequential program Java offers
tools to coordinate access among threads.

*SafeSequence* introduces the Java keyword <code>synchronized</code> why this works will be covered in Chapter 2 and 3.


<h3>Threads are Everywhere</h3>
Even if your program does not explicitly create a thread, frameworks may
create threads on your behalf. Code called from these threads must be thread safe.

Every Java application uses threads. The JVM creates threads for housekeeping "garbage collection, finalization" and the main thread.
Code that calls frameworks must ensure they are code safe. The need for concurrency is contagious.

</blockquote>