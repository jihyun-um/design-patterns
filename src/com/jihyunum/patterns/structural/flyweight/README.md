## Flyweight

- Intent: Use sharing to support large numbers of fine-grained objects efficiently.
- A flyweight is a shared object th at can be used in multiple contexts simultaneously.
- Intrinsic state is stored in the flyweight; it consists of information that 's independent of the flyweight's context, thereby making it sharable.
- Extrinsic state depends on and varies with the flyweight's context and therefore can't be shared. Client objects are responsible for passing extrinsic state to the flyweight when it needs it.

## General Structure
![](flyweight_structure.png)

## Example
In my example the participants are represented as following:
- Flyweight: [Book](./books/Book.java)
- Concrete Flyweight: [BookRental](./books/BookRental.java)
- Flyweight Factory: [BookFactory](./books/BookFactory.java)
- Client: [Library](./library/Library.java)

## Pros/Cons
Pros ❤️
- It lets you save your space, which increase as more flyweights are shared.
- Storage savings are a function of several factors:
    - the reduction in the total number of instances that comes from sharing
    - the amount of intrinsic state per object
    - whether extrinsic state is computed or stored
- Sharing reduces the cost of intrinsic state, and you trade extrinsic state for computation time.

Cons 💔
- It may introduce run-time costs associated with transferring, finding, and/or computing extrinsic state, especially if it was formerly stored as intrinsic state.