# cordova-aqs-ios

Author: Christopher J. Brody

License: BSD 3-Clause or commercial

I can hereby testify that this project is completely my own work and not subject to agreements with any other parties.
In case of code written under direct guidance from sample code the link is given for reference.
In case I accept contributions from any others I will require CLA with similar statements.
License is subject to change, and this project may be dedicated to the public domain at some point in the future.

## About

Javascript can do XHR query of certain URI(s) starting with `file://aqaq` and receive a callback in the `aqcallback` function. This is similar to the native iOS part of [@brodybits / aqsa-query-test-ios](https://github.com/brodybits/aqsa-query-test-ios) working within a Cordova plugin. This *should* also work from a web worker. This will be used to support sqlite access from a web worker.

## Major tips & tricks

- Specifies configuration in `plugin.xml` to initialize this plugin on startup, THANKS to cordova-plugin-whitelist
- Uses a subclass of `NSURLProtocol` to intercept XHR requests

## Security TODO(s)

Enforce use of secret bridge code, like the Cordova framework does.

## Related project(s)

- https://github.com/brodybits/aqsa-query-test-ios

TBD others
