import Field from './Fields';

export default function Form({ type }) {

    const loginForm = (
        <form id='loginForm'>
            <i className='fa-solid fa-house w-100'></i>
            <h1 className='loginTitle ta-center'>Sign in to Hotel Suites</h1>

            <label htmlFor='username'>Username</label>
            <input name='username' type='text'></input>

            <label htmlFor='password'>Password</label>
            <input name='password' type='password'></input>

            <button type='submit'>Sign in</button>
        </form>
    )

    const bookingForm = (
        <form id='bookingForm' className='ji-center'>
            <Field type='date' text='Check In' />
            <Field type='date' text='Check Out' />
            <Field type='people' text='People' />

            <button className='cursor-pointer' type='submit' onClick={testAPI}>Find Bookings</button>
        </form>
    );

    return (
        <>
            { type === 'login' && loginForm }
            { type === 'booking' && bookingForm }
        </>
    )
}

async function testAPI(event) {
    event?.preventDefault();

    // GitHub API example (public API, no auth needed)
    let response = await fetch('https://api.github.com/users/UnderwoodUnderscore/repos');

    if (!response.ok) {
        console.log('API request failed: ', response.status);
    } else {
        let data = await response.json();
        console.log('API request successful: ');
        data.forEach((repo) => {
            console.log(repo.url);
        });
    }
}