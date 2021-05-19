# Java Chat

## About

* A simple Client/Server implementation
* Intended to form the basis of Internet communication based robotics projects

* Project status: In development

Video demonstration:

[Click here to see the project in action on YouTube](https://www.youtube.com/embed/KwgaycbBDQw)

We see here a simple RC style plane, using Internet communication to control its servos. This type of communication potentially leads to near infinite range of the vehicle. Initial tests however show that lag is an issue. The system as it stands would be more suited to a ground based vehicle such as a boat or a rover however, a slow flying glider type configuration would theoretically be feasible.

## Table of contents

- [Java Chat](#java-chat)
  - [About](#about)
  - [Table of contents](#table-of-contents)
  - [Installation](#installation)
  - [Usage](#usage)
  - [Using the system on the WWW](#using-the-system-on-the-www)
  - [Port Forwarding (general guide)](#port-forwarding-general-guide)
    - [Screenshots](#screenshots)

## Installation

For testing the default implementation, simply open two terminals. First, run the server in one of the terminals. Then, run the client in  the other terminal. The terminals will output their connection status and prompt the user to enter commands.

## Usage

Type a message into the client and press enter. You should see the message received by the server. Type 'quit' at any time to close the connection on both client and server.

## Using the system on the WWW

The default code hosted here utilises a loopback address for the server. You can run the server on any machine/connection combo that will allow port forwarding. Most ISP's these days allow it (it is used heavily in online gaming). The method by which your particular router can be set up for port forwarding varies. There follows a general guide, see your routers documentation for further guidence. It can be difficult at times to get it working, but persevere - it is very satisfying to see your program operate over the world wide web.

## Port Forwarding (general guide)

* Login to your router via the routers default gateway. If you have never done this before, your password and username should be printed somewhere on the router.
* Find the port forwarding settings (these are typically listed under advanced settings on most brands)
* Give your device a name like 'Raspberry Pi Server' or similar so its easy to identify.
* You will need to provide the router with the 'internal' IP address of the server computer. This is the IP address that your router assignes to the device (something like 192.168.1.7)
* This internal IP address can change from time to time. This is typically not a problem but most routers allow you to assign a certain internal IP to a certain device. Have a look at the settings for this feature.
* Give the device a port number. It can be pretty much anything you like (I always use something like '6666' or '5555' for example)
* Under protocol, select 'TCP/UDP'
* With all that done, head over to [whatismyip](https://whatismyipaddress.com/) and you will be presented with your public IP address. This is actually the address of your router. In order to acsess the server from a client, you would connect to this public IP adress with the port number you chose in the previous step.

### Screenshots

![Server running](/readme_files/scr1.png)

*Image 1. The Server is running, waiting on clients to connect*

![Client running](/readme_files/clientscr2.png)

*Image 2. The prompt will inform the user what commands are available*

![Message sent](/readme_files/scr3.png)

*Image 3. The client has typed and sent a message, it is now visible on the server*

![Sockets disconnected](/readme_files/scr4.png)

*Image 4. Client has typed 'quit' therefore closing the socketed connection on both endpoints*