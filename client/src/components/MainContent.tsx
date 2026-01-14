import { useState } from 'react';
import Header from './Header';
import Feature from './Feature';
import Form from './Forms';

export default function MainContent({ page }) {

    const isAdmin = false;

    const Home = ShowHome(isAdmin);
    const Settings = ShowSettings();
    const Account = ShowAccount();

    let pageContent = {"Home" : Home, "Settings" : Settings, "Account" : Account};

    return (
        <section className='mainContent'>
            {pageContent[page]}
        </section>
    )
}

function ShowHome( isAdmin: boolean) {
    if (isAdmin) {
        return (
            <>
            </>
        );

    } else {
        return (
            <div className='intro'>
                <h1>Find Your Perfect Place to Stay</h1>
                <p>Conveniently aggregate interoperable value after cross functional innovation.
                    Enthusiastically transition innovative web services before future-proof.
                </p>

                <Feature imgSrc='https://picsum.photos/1400/900' />

                <Form type='booking' />
            </div>
        );
    }
}

function ShowSettings() {

    return (
        <section className='mainContent'>
        
        </section>
    )
}

function ShowAccount() {

    const [display, setDisplay] = useState('AccountSettings')

    const AccountSettings = (
        <>
        </>
    )

    return (
        <section className='mainContent'>
            {/* user profile icon (top right) */}
            {/* start at 'Account Settings' by default */}
            <ul className='accountOptions'>
                <li>Account Settings</li>
                <li>Reservations</li>
                <li>Log Out</li>
                <li></li>
            </ul>
        </section>
    )
}