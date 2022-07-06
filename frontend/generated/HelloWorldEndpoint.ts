/**
 * This module is generated from HelloWorldEndpoint.java
 * All changes to this file are overridden. Please consider to make changes in the corresponding Java file if necessary.
 * @see {@link file:///Users/taivu/Documents/PushNotification/push-notification/src/main/java/com/example/application/endpoints/helloworld/HelloWorldEndpoint.java}
 * @module HelloWorldEndpoint
 */

// @ts-ignore
import client from './connect-client.default';
// @ts-ignore
import { Subscription } from '@hilla/frontend';


function _sayHello(
 name: string
): Promise<string>
{
 return client.call('HelloWorldEndpoint', 'sayHello', {name});
}
export {
  _sayHello as sayHello,
};
