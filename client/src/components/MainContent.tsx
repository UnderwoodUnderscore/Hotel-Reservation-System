import Feature from './Feature';
import Form from './Forms';

export default function MainContent({ page, onPageChange }) {

    const isAdmin = false;

    const Home = ShowHome(isAdmin);
    const Rooms = ShowRooms();
    const Reservations = ShowReservations();
    const Settings = ShowSettings();

    function ShowAccount(option = 'Account Settings') {
        
        let pageContent;

        if (option === 'Account Settings') {
            pageContent = (
                <section className='mainContent'>
                    {/* user profile icon (top right) */}
                    {/* start at 'Account Settings' by default */}
                    <ul className='accountOptions'>
                        <li><button onClick={() => updatePage(onPageChange, 'Account')}>Account Settings</button></li>
                        <li><button onClick={() => updatePage(onPageChange, 'Reservations')}>Reservations</button></li>
                        <li>Log Out</li>
                        <li></li>
                    </ul>
                </section>
            );
        }

        return pageContent;
    }
    const Account = ShowAccount();
    

    let pageContent = {"Home" : Home, "Settings" : Settings, "Account" : Account, "Rooms" : Rooms, "Reservations" : Reservations,
        
    };

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
            <div className='intro ta-center'>
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

function ShowRooms() {

    return (
        <section className='mainContent'>
            <h1>Rooms</h1>
        </section>
    )
}

function ShowReservations() {

    return (
        <>
            <h1>Reservations</h1>
        </>
    )
}

function updatePage(updaterFunc: Function, newPage: string) {
    return updaterFunc(newPage);
}